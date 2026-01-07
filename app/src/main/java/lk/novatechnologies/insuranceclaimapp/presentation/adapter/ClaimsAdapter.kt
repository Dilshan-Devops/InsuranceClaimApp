package lk.novatechnologies.insuranceclaimapp.presentation.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import lk.novatechnologies.insuranceclaimapp.R
import lk.novatechnologies.insuranceclaimapp.domain.model.Claim

class ClaimsAdapter(private var claims: List<Claim>) : RecyclerView.Adapter<ClaimsAdapter.ClaimViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ClaimViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_claim, parent, false)
        return ClaimViewHolder(view)
    }

    override fun onBindViewHolder(holder: ClaimViewHolder, position: Int) {
        holder.bind(claims[position])
    }

    override fun getItemCount() = claims.size

    fun updateClaims(newClaims: List<Claim>) {
        claims = newClaims
        notifyDataSetChanged()
    }

    class ClaimViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val policyNumber: TextView = itemView.findViewById(R.id.policy_number)
        private val description: TextView = itemView.findViewById(R.id.description)
        private val status: TextView = itemView.findViewById(R.id.status)

        fun bind(claim: Claim) {
            policyNumber.text = claim.policyNumber
            description.text = claim.description
            status.text = claim.status
        }
    }
}